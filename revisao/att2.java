public class att2 {
    public static class Album{
        private String name;
        private String artist;
        private double price;
        private int numberOfCopies;

        public void sellCopies(int numberOfCopies){
            if( numberOfCopies > 0){
                System.out.println("Álbum vendido");
            }else{
                System.out.println("Álbum esgotado");
            }
        }

        public void orderCopies(int num){
            numberOfCopies += num;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getArtist(){
            return artist;
        }
        public void setArtist(String artist){
            this.artist = artist;
        }

        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            if(price > 0){
                this.price = price;
            }else{
                this.price = 0.0;
            }
        }

        public int getNumberOfCopies(){
            return numberOfCopies;
        }
        public void setNumberOfCopies(int numberOfCopies){
            if(numberOfCopies > 0){
                this.numberOfCopies = numberOfCopies;
            }else{
                this.numberOfCopies = 0;
            }
        }
    }

    public static class StockKeeper{
        private String name;
        StockKeeper(String name){
            this.name = name;
        }

        public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
            
            album.setName(name);
            album.setArtist(artist);
            album.setPrice(price);
            album.setNumberOfCopies(numberOfCopies);

            System.out.println("Album gerenciado por :"+ getName());
            System.out.println("Detalhes do album::::::::::");
            System.out.println("Nome do album : " + album.getName());
            System.out.println("Artista do Album : " + album.getArtist());
            System.out.println("Preço do Album : " + album.getPrice());
            System.out.println("Número de cópias do album : " + album.getNumberOfCopies());
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        StockKeeper johnDoe = new StockKeeper("John Doe");
        
        johnDoe.manageAlbum(new Album(), "Aventuras do Roberto", "Roberto", 100.50, 2);
    }
}
