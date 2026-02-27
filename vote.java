class VoteCheck {

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not Eligible to Vote");
        } else {
            System.out.println("Eligible to Vote");
        }
    }
}

class vote {
    public static void main(String[] args) {

        try {
            VoteCheck.checkAge(16); 
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
