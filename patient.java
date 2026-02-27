class Patient {
    private int patientId;
    private String name;
    private String medicalHistory;
    private double billAmount;
    public Patient(int id, String name, String history, double bill) {
        this.patientId = id;
        this.name = name;
        this.medicalHistory = history;
        this.billAmount = bill;
    }
    public String getMedicalHistory() {
        return medicalHistory;
    }
    public void display() {
        System.out.println(patientId + " " + name + " " + billAmount);
    }
}
class patient {
	public static void main(String[]args) {
		Patient p1 = new Patient(101, "Jamuna", "Fever", 2500);
        p1.display();
        System.out.println("Medical History of p1: " + p1.getMedicalHistory());
        Patient p2 = new Patient(101, "Janani", "Stomach pain", 2500);
        p2.display();
        System.out.println("Medical History of p2: " + p2.getMedicalHistory());
	}
}
