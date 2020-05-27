#include <stdio.h>
#include <iostream>
#include <stdlib.h>

using namespace std;

const int PRODUCT_QUANTITY_MAX = 10;
const int IVA = 12;

static const int MAX_CLIENT_NUMBER = 512;
static const int MAX_QUANTITY = 50;
static const int MAX_ORDER_NUMBER = 1024;

static const char *STORE_PATH_FILE = "/tmp/orders/store.txt";
int currentOrderPosition = 0;
enum IdentificationTypes {
    CI, RUC
};

typedef struct {
    int id;
    string name;
    double price;
    bool iva;
    int ivaPercent;
    int quantity;
} Product;

typedef struct {
    int id;
    int quantity;
} OrderProduct;

typedef struct {
    string ci;
    string name;
    string lastName;
    string address;
    string phoneNumber;
    IdentificationTypes identificationTypes;
    string email;
} Client;

typedef struct {
    int orderId;
    Client client;
    OrderProduct products[PRODUCT_QUANTITY_MAX];
    int productQuantity;
} Order;

typedef struct {
    Product products[PRODUCT_QUANTITY_MAX];
    Client clients[MAX_CLIENT_NUMBER];
    Order orders[MAX_ORDER_NUMBER];
    int currentOrderPosition;
} Store;

//Global Variables
Store *store;
Order currentOrder;


//Global functions
void printMainMenu();

Store *createStore();

void printAllProduct(Store *store);

int retrieveRandomNumber();

void printMainMenu();

int readOption();

void processOption(int option);

Order createOrder();

void init();

void printOrderMenu();

void processOrderOption();

void addProductToOrder();

void editProductToOrder();

void removeProductToOrder();

int searchMaxOrderId();

Product *getProductInStoreById(int id);

void finishOrder();

Client *createInvoiceWithData();

Client createDefaultClient();

void updateStoreProductQuantities();

void printInvoice();

void saveStore();

int main() {
    store = createStore();
    init();
    return 0;
}

void init() {
    printMainMenu();
    int option = readOption();
    processOption(option);
}

void processOption(int option) {
    switch (option) {
        case 1:
            printAllProduct(store);
            init();
            break;
        case 2:
            store->orders[currentOrderPosition++] = createOrder();
            break;
        case 3:
            printf("Gracias por usar nuestra aplicación");
            saveStore();
            exit(0);
    }
}

void saveStore() {
    FILE *storeFile;
    storeFile = fopen(STORE_PATH_FILE, "wb");
    fwrite(store, sizeof(Store), 1, storeFile);
    fclose(storeFile);
}

int readOption() {
    int option = 0;
    printf("Escoja la opcion deseada: ");
    scanf("%d", &option);
    if (option < 1 || option > 3) {
        printf("Opcion no valida, los valores son 1, 2 o 3\n");
        return readOption();
    }
    return option;
}

void printMainMenu() {
    printf("********************* Menu de opciones *********************\n");
    printf("1. Listar productos en bodega\n");
    printf("2. Crear muevo pedido\n");
    printf("3. Salir\n");
}

Store *createStore() {
    FILE *storeFile;
    storeFile = fopen(STORE_PATH_FILE, "rb");
    store = new Store;
    if (storeFile == NULL) {
        string productsName[PRODUCT_QUANTITY_MAX] = {"PIZZA NAPOLITANA", "PIZZA HAWAIANA", "PIZZA MEDITERRANEA",
                                                     "COCA COLA", "COCA SPRITE", "COCA FANTA", "AGUA NATURAL",
                                                     "AGUA GASEADA", "HAMBURGUESA SIMPLE", "HAMBURGUESA DOBLE"};

        double productsPrice[PRODUCT_QUANTITY_MAX] = {5, 5.5, 7, 1.1, 1, 1, 0.5, 0.75, 2.50, 4};
        for (int i = 0; i < PRODUCT_QUANTITY_MAX; i++) {
            bool iva = i % 2 == 0;
            Product product = Product();
            product.id = i + 1;
            product.iva = iva;
            product.ivaPercent = 0;
            if (iva) {
                product.ivaPercent = IVA;
            }
            product.name = productsName[i];
            product.quantity = retrieveRandomNumber();
            product.price = productsPrice[i];
            store->products[i] = product;
        }
        store->clients[0] = createDefaultClient();
        return store;
    }
    fread(store, sizeof(Store), 1, storeFile);
    fclose(storeFile);
    return store;
}

Client createDefaultClient() {
    Client client = Client();
    client.ci = "9999999999";
    client.name = "Consumidor Final";
    client.lastName = "";
    client.address = "9999999999";
    client.phoneNumber = "9999999999";
    client.identificationTypes = CI;

    return client;
}

int retrieveRandomNumber() {
    return rand() % MAX_QUANTITY;
}

void printAllProduct(Store *store) {
    for (int i = 0; i < PRODUCT_QUANTITY_MAX; i++) {
        printf("ID PRODUCTO: %d\n", store->products[i].id);
        printf("NOMBRE PRODUCTO: %s\n", store->products[i].name.c_str());
        printf("PRECIO: %.2f\n", store->products[i].price);
        printf("PROCIENTO IVA PRODUCTO: %d\n", store->products[i].ivaPercent);
        printf("CANTIDAD PRODUCTO: %d\n", store->products[i].quantity);

        printf("\n\n");
    }
}

int searchMaxOrderId() {
    int orderId = 1;
    for (int i = 0; i < store->currentOrderPosition; i++) {
        orderId = max(orderId, store->orders[i].orderId);
    }
    return orderId;
}

Order createOrder() {
    currentOrder = Order();
    currentOrder.orderId = searchMaxOrderId() + 1;
    printOrderMenu();
}

void printOrderMenu() {
    cout << "1. Adicionar Producto al pedido" << endl;
    cout << "2. Modificar producto del pedido" << endl;
    cout << "3. Eliminar producto del pedido" << endl;
    cout << "4. Finalizar Pedido" << endl;
    processOrderOption();
}

void processOrderOption() {
    int option = 0;
    cin >> option;
    if (option < 1 || option > 4) {
        cout << "La opción no es válida" << endl;
        processOrderOption();
    }
    switch (option) {
        case 1:
            addProductToOrder();
            break;
        case 2:
            editProductToOrder();
            break;
        case 3:
            removeProductToOrder();
            break;
        case 4:
            finishOrder();
            break;
    }
}

void finishOrder() {
    int option = 0;
    while (option <= 0 || option > 2) {
        cout << "Desea 1. Factura o 2. Consumidor final : ";
        cin >> option;
        if (option <= 0 || option > 2) {
            cout << "Opción inválida, vuelva a intentar" << endl;
        }
    }
    Client *client = NULL;
    switch (option) {
        case 1:
           // client = createInvoiceWithData();
            break;
        case 2:
            currentOrder.client = store->clients[0];
            store->orders[store->currentOrderPosition++] = currentOrder;
            break;
    }
    printInvoice();
    init();
}

void printInvoice() {
    cout << "***************** Orden " << currentOrder.orderId << endl;
    double subtotal = 0;
    double iva = 0;
    cout << "PRODUCTO    CANTIDAD   Precio(U)" << endl;
    for (int i = 0; i < currentOrder.productQuantity; i++) {
        Product *product = getProductInStoreById(currentOrder.products[i].id);
        int quantity = currentOrder.products[i].quantity;
        double price = product->price;
        cout << product->name << "      " << quantity << "       " << price;
        subtotal += quantity * price;
        if (product->iva) {
            iva += quantity * price * 12 / 100;
        }
    }

    cout << endl;
    cout << "SUBTOTAL: " << subtotal << endl;
    cout << "IVA: " << iva << endl;
    cout << "TOTAL:" << subtotal + iva << endl;
}


/*Client *createInvoiceWithData() {
    //TODO request type and identification and if there is a client in the store, so use it otherwise create a new client
    return nullptr;
}*/

Product *getProductInStoreById(int id) {
    for (int i = 0; i < PRODUCT_QUANTITY_MAX; i++) {
        Product *product = &store->products[i];
        if (product->id == id) {
            return product;
        }
    }
    return NULL;
}

void removeProductToOrder() {

}

void editProductToOrder() {

}

void addProductToOrder() {
    Product *product = NULL;
    int productId;
    while (product == NULL) {
        cout << "Ingrese el id del producto: ";
        cin >> productId;
        product = getProductInStoreById(productId);
        if (product->id <= 0) {
            cout << "El id ingresado no existe" << endl;
        }
        //TODO check if the product exists
    }
    cout << "Ingrese la cantidad deseada: ";
    int quantity = 0;
    while (quantity <= 0 || quantity > product->quantity) {
        cin >> quantity;
        if (quantity <= 0) {
            cout << "La cantidad no debe ser mejor ni igual a 0" << endl;
            continue;
        }
        if (quantity > product->quantity) {
            cout << "La cantidad de producto solicitado excede a la cantidad existente" << endl;
            continue;
        }
    }
    OrderProduct orderProduct = OrderProduct();

    orderProduct.id = productId;
    orderProduct.quantity = quantity;

    currentOrder.products[currentOrder.productQuantity++] = orderProduct;
    product->quantity -= orderProduct.quantity;
    printOrderMenu();
}
