import java.util.ArrayList;

public class ATM extends Kısal {
    public int meblag;
    private ArrayList<Integer> ikiyuzlukBanknot=new ArrayList<Integer>();
    private ArrayList<Integer> yuzlukBanknot=new ArrayList<Integer>();
    private ArrayList<Integer> ellilikBanknot=new ArrayList<Integer>();
    private ArrayList<Integer> yirmilikBanknot=new ArrayList<Integer>();
    private ArrayList<Integer> onlukBanknot=new ArrayList<Integer>();
    private ArrayList<Integer> beslikBanknot=new ArrayList<Integer>();



    public  void paraKasalari(){

        ikiyuzlukBanknot.add(20);
        yuzlukBanknot.add(20);
        ellilikBanknot.add(20);
        yirmilikBanknot.add(20);
        onlukBanknot.add(20);
        beslikBanknot.add(20);

        meblag=(200* ikiyuzlukBanknot.get(0)+(100*yuzlukBanknot.get(0))+(50*ellilikBanknot.get(0))
                +(20*yirmilikBanknot.get(0))+(10*onlukBanknot.get(0))+(5*beslikBanknot.get(0)));



    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);

    }

    public void paraCek(int tutar){
        setX(tutar);
        kısalt(200,ikiyuzlukBanknot,"*200'lük Banknot ");
        kısalt(100,yuzlukBanknot,"*100'lük Banknot ");
        kısalt(50,ellilikBanknot,"*50'lik Banknot ");
        kısalt(20,yirmilikBanknot,"*20'lik Banknot ");
        kısalt(10,onlukBanknot,"*10'luk Banknot");
        kısalt(5,beslikBanknot,"*5'lik Banknot");
        tutar -=getX();
        System.out.println("Toplam Çekilen Para : "+tutar);

    }

}
