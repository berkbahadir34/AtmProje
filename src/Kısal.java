import java.util.ArrayList;

public class Kısal {
    private int x ;

    public void kısalt(int deger, ArrayList<Integer> arrayList, String yazi){

        String cekilenPara="Çekilen Para : ";

        int eldekiTutar;


        if((x/deger)>arrayList.get(0)){
            cekilenPara+=arrayList.get(0)+yazi;
            eldekiTutar=arrayList.get(0)*deger;
            arrayList.remove(0);
            arrayList.add(0);
            x -=eldekiTutar;
        }
        else{
            cekilenPara +=(x/deger)+yazi;
            eldekiTutar=(x/deger)*deger;
            arrayList.add(arrayList.get(0)-(x/deger));
            arrayList.remove(0);
            x -=eldekiTutar;
        }
        System.out.println(cekilenPara+" çekiliyor...");

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
