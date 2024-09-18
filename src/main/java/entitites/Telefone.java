package entitites;

public class Telefone {
    private Integer ddd;
    private String num;
    
    public Telefone() {       
    }

    public Telefone(Integer ddd, String num) {
        this.ddd = ddd;
        this.num = num;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    public static Telefone parser(String tel) {
        
        Telefone telefone = new Telefone();
        
        if(verificaDDD(tel)) {
           telefone.setDdd(Integer.parseInt(tel.substring(1, 2)));
        } else {
            throw new TelefoneException();
        }
        
        if(verificaTelefone(tel)) {
            String telNum = tel.substring(4);                       
            telefone.setNum(telNum);            
        } else {
            throw new TelefoneException();
        }      
        return telefone;      
    }
    
    private static boolean verificaDDD(String tel){
        String telDDD = tel.substring(0, 3);
        
        if (telDDD.charAt(0) == '(' && telDDD.charAt(3) == ')')
            return true;
        return false;
    }
    
    private static boolean verificaTelefone(String tel) {
        String[] telefone;
        
        String telNum = tel.substring(4);
        
        if(telNum.charAt(4) == '-' || telNum.charAt(5) == '-'){
            telefone = telNum.split("-");
            if((telefone[0].length() == 4 || telefone[0].length() == 5) && (telefone[1].length() == 4)) {
                return true;
            }
        }            
        return false;
    }
}
