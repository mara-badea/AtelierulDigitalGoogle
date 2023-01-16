# Problema rezolvata prin implementarea design pattern-ului *Chain Of Responsibility*

### Se doreste construirea unui sistem care proceseaza comenzile clientilor la un magazin. Fiecare comanda poate avea mai multe articole dar doar de acelasi fel, si pentru fiecare comanda pot fi aplicate mai multe promotii: 1+1 gratis pentru articole cumparate, Livrare gratuita, discounts.
***
Pentru rezolvarea problemei, am creat:      
O clasa **Item** ce contine:
- atributele price, quantity, name, shippingCost;
- Un constructor ce initializeeaza atributele de mai sus;
- getters si setters pentru price, quantity, name, shippingCost;
- un setter setQuantityPrice, care seteaza price in functie de cantitate

***
o clasa abstracta **Promotion** ce are:  
- un constructor care initializeaza:  
 a) un obiect de tip Promotion ce reprezinta urmatoarea promotie din cele valabile, numele magazinului care ofera promotia;  
 b) numele magazinului care ofera promotia;   
 c) descrierea promotiei;    
 d) id-ul promotiei;
- o metoda abstracta de tip void **applyPromotion** ce ia ca argument un obiect de tip Item si este implementata de fiecare subclasa
- o metoda abstracta de tip boolean **isEligible** care ia ca argument un obiect de tip Item care verifica daca cosul de produse este eligibil pentru reducere si este implementata de fiecare subclasa
- getters si setters pentru campurile initializate in constructor
***       
O clasa **FreeShipping** care este una din subclasele superclasei **Promotion** ce contine:

- Un atribut **FreeShippingPrice** ce reprezinta valoarea minima a cosului pentru care se aplica promotia 
- un constructor ce initializeaza toate atributele
- metoda **isEligible** care verifica daca valoarea cosului este peste valoarea minima pentru a primi livrare gratuita
- metoda **applyPromotion** care, daca este eligibila comanda pentru reducere, scade costul de livrare din costul total al comenzii, iar daca nu, verifica produsul pentru urmatoarea promotie          
***
O clasa **AdditionalDiscount** care este una din subclasele superclasei **Promotion** ce contine:

- Doua atribute de tip double, discount - care reprezinta reducerea exprimata in procente - si overPrice - care reprezinta valoarea minima a cosului pentru care se aplica reducerea;
- Un constructor care initializeaza atributele din superclasa si pe cele din clasa curenta;
- metoda **isEligible** ia ca argument un obiect de tip Item ce verifica daca valoarea cosului este peste valoarea minima pentru care reducerea poate fi aplicata
- metoda **applyPromotion** ia ca argument un obiect de tip Item ce aplica reducerea, iar daca argumentul nu este eligibil, aplica urmatoarea promotie cosului;        
***

O clasa **BuyOneGetOneFree** care este una din subclasele superclasei **Promotion** ce contine:   

- Un constructor ce initializeaza atributele din superclasa
- metoda **isEligible** ia ca argument un obiect de tip Item ce verifica daca sunt minim 2 produse in cos
- metoda applyPromotion ia ca argument un obiect de tip Item ce reduce valoarea cosului in functie de numarul de articole cu numar par, iar daca argumentul nu este eligibil, aplica urmatoarea promotie cosului;      

O interfata **Handler** cu o metoda **applyPromotions** ce ia ca argument un obiect de tip Item;

***

O clasa **PromotionHandler** care implementeaza interfata **Handler** ce contine:   

- un constructor ce realizeaza ordinea in care se aplica promotiile;
- metoda **applyPromotions** ce seteaza pretul cosului in functie de numarul de produse, seteaza promotia curenta ca fiind prima promotie setata in constructorul anterior, si aplica promotiile pana cand gaseste o promotie nula;     

***

Clasa Main in care se realizeaza testarea