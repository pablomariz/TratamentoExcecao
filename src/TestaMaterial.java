public class TestaMaterial {
    public static void main(String[] args) {
        
        
        try{
            
            Material m= new Material("Parafuso", -2);
            
        }catch(QuantidadeInvalidaException ex){
        
            System.out.println(ex.getMessage());
        }
    }
    
}