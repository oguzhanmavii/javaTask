public class Siparis {
    private int siparisId;
    private int malNumarasi;
    private int adet;
    private double birimFiyati;

    public Siparis(int siparisId,int malNumarasi,int adet,double birimFiyati){
        this.siparisId=siparisId;
        this.malNumarasi=malNumarasi;
        this.adet=adet;
        this.birimFiyati=birimFiyati;
    }

    public int getSiparisId()
    {
        return siparisId;
    }
    public int getMalNumarasi()
    {
        return malNumarasi;
    }
    public int getAdet()
    {
        return adet;
    }
    public  double getBirimFiyati()
    {
        return birimFiyati;
    }
}
