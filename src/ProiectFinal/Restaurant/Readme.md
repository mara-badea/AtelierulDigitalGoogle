# Problema rezolvata prin implementarea design pattern-ului Builder

## Se cere crearea unei clase care reprezinta meniul comandat de client la un restaurant fast-food. Meniul ar trebui sa includa un fel principal, o garnitura, o bautura si, daca meniul contine o jucarie sau nu.
****
### Pentru rezolvarea problemei, am creat:

***

O clasa **mealBuilder** ce contine:  

- atributele de tip String mainDish, sideDish, drink si atributul de tip boolean isHasToy
- metoda **buildMainDish** ce ia ca argument un atribut de tip mainDish, seteaza atributul din clasa curenta cu cel luat ca argument si se returneaza;
- metoda **buildSideDish** ce ia ca argument un atribut de tip sideDish, seteaza atributul din clasa curenta cu cel luat ca argument si se returneaza;
- metoda **buildDrink** ce ia ca argument un atribut de tip drink, seteaza atributul din clasa curenta cu cel luat ca argument si se returneaza;
- metoda **buildHasToy** ce ia ca argument un atribut de tip isHasToy, seteaza atributul din clasa curenta cu cel luat ca argument si se returneaza;
- o metoda **build** de tip Meal care, daca meniului ii lipseste ceva (nu are bautura, nu are garnitura, nu are bautura), arunca o exceptie de tip **IllegalArgumentException**, iar, in caz contrar, meniul este realizat;

***

O clasa **Meal** ce contine:

- atributele de tip String mainDish, sideDish, drink si atributul de tip boolean isHasToy; 
- un constructor ce ia ca argument un obiect de tip **mealBuilder** ce initializeaza atributele din clasa curenta cu atributele ce apartin obiectului de tip mealBuilder;
- getters pentru atributele din clasa;

***

O clasa **Main** in care se realizeaza testarea.