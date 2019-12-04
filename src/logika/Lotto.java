
package logika;

import java.util.ArrayList;

public class Lotto {
    private ArrayList<Integer> lottoSzamok;
    private int maxLottoSzam;
    private int lottoTipus;
    
    public Lotto(int lottoTipus){
        lottoSzamok = new ArrayList<>();
        this.lottoTipus = lottoTipus;
        ujLotto(lottoTipus);
    }
    
    public void ujLotto(int lottoTipus){
        this.lottoTipus = lottoTipus;
        switch(lottoTipus){
            case 5: this.maxLottoSzam = 90; break;
            case 6: this.maxLottoSzam = 45; break;
            case 7: this.maxLottoSzam = 35; break;
            
        }
    }
    
    public void Sorsol() throws Exception{
        if (mindenSzamotKisorsoltakE()) {
            int szam;
            do {
                szam = (int) (Math.random()*maxLottoSzam)+1;
            } while (!lottoSzamok.contains(szam));
            lottoSzamok.add(szam);
        } else {
            throw new Exception("Minden számot kihúztak!");
        } 
    }
    
    public boolean mindenSzamotKisorsoltakE(){
        return this.lottoSzamok.size() == lottoTipus;
    }

    public void Rendez(){
        lottoSzamok.sort(Integer :: compareTo);
    }

    @Override
    public String toString() {
        String s = "";
        for (Integer i : lottoSzamok) {
            s += i +" ";
        }
        return s;
    }
    
    
    
}
