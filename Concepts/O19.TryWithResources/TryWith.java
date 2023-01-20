package O19.TryWithResources;

class Temp implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
    // see ReadingTextFiles for practical implementation of TryWithResources
    public class TryWith{
        public static void main(String[] args) {
            try(Temp temp= new Temp()){ //try with resources
        } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

