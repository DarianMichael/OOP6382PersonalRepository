public class Bill{
	private int idBill;
	private Client client;
	private List<PairOfShoes> pairsOfShoes;
	private float totalPrice;
	private Date date;
	
	public Bill (int idBill, Client client, List<PairOfShoes> pairsOfShoes, float totalPrice,Date date){
		this.idBill = idBill;
		this.client = client;
		this.pairsOfShoes = new ArrayList<>();
		this.totalPrice = totalPrice;
		this.date = date;
	}
	
	public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }
	
	public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
	
	public List<PairOfShoes> getListOfShoes() {
		return pairsOfShoes;
	}
	
	public void setListOfShoes(List<Person> persons) {
        this.persons = persons;
    }
	
	public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
	}
	
	public int getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
	
	@Override
	 public String toString{
		 return "No." + idBill +"\n" + client + "\n" + pairsOfShoes + "\n\n\n" + totalPrice + date;
}