import java.sql.Connection;

public class TesteDB {
	
	public static void main(String[] args) {
        
        try{
            Connection banco = ConnectionFactory.getConnection();
            System.out.println("Conex�o OK!!");
        }
        catch(Exception e){
            System.out.println("Erro na conex�o>>>");
            System.out.println(e);
        }
    }
}
