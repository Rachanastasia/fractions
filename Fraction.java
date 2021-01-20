
public class Fraction{
  private int numerator;
  private int denominator;
  
  public static void main(){
    Fraction fraction = new Fraction();
  }
  
  public Fraction(){
    this.numerator = 1;
    this.denominator = this.numerator;
  }
  
  public Fraction(int n, int d){
    this.denominator = d == 0 ? 1 : d;
    this.numerator = n == d ? this.denominator : n;
  }
  
  public int getNumerator(){
    return numerator;
  }
  
  public int getDenominator(){
    return denominator;
  }
  
  public void setNumerator(int n){
    this.numerator = n;
  }
  
  public void setDenominator(int d){
    this.denominator = d == 0 ? 1 : d;
  }
  
  
  public String toString(){
    int fN = this.getNumerator();
    int fD = this.getDenominator();
    
    String newN = Integer.toString(fN);
    String newD = Integer.toString(fD);
    
    String fr = newN + "/" + newD;
    return fr;
  }
  
  public Fraction add(Fraction a){
    int aN = a.getNumerator();
    int aD = a.getDenominator();
    int bN = this.getNumerator();
    int bD = this.getDenominator();
    
    if(aD == bD){
      int newN = aN + bN;
      Fraction frac = new Fraction(newN, aD);
        return frac;
    }
    else{
      int newD = aD * bD;
      int newNm = (aN + bN) * bD;
      
      Fraction frac = new Fraction(newNm, newD);
      return frac;
    }
  }
}