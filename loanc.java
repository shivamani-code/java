class loanc {
    public static void main(String[] args) {

        class loan {
            double p =34 ;
            double t = 32;
            int r = 76;
            double ans= (p*t*r)/100;
            double cal(){
                return ans;
            }
        }


        loan a = new loan;
        a.cal();

    }


}