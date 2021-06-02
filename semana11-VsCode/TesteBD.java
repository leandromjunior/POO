import java.sql.Connection;

public class TesteDB{
    public static void main(String[] args) {
        
        try{
            Connection banco = ConnectionFactory.getConnection();
            System.out.println("Conexão OK!!");
        }
        catch(Exception e){
            System.out.println("Erro na conexão>>>");
            System.out.println(e);
        }
    }
}