from pylab import *    # tout numpy et pyplot
from interp import *   # importation des fcts d'interpolation
 
n = 7                    # nb de points d'interpolation
a = 0; b = 2*pi           # l'intervalle d'interpolation
m = 300                   # nb de points pour le trace des courbes
t = linspace(a, b, m)     # les abscisses pour le trace des courbes
x = linspace(a, b, n)     # les abscisses d'interpolation
y = runge(x)                # les ordonnees d'interpolation
 
# le calcul
p = lagrange_v(t,x,y)      # evaluation du polynome
s = runge(t)                 # evaluation de la fonction exacte
           
# calcul d'erreur et visu graphique
e = s - p
figure(0)
clf()
subplot(2,1,1)
plot(x, y, 'bo', t, p, 'r-', t, s, 'g-')
legend(("points d'interpolation","polynome d'interpolation","fonction exacte"),loc=1)
title('Interpolation de la fct runge')
 
subplot(2,1,2)
plot(t, e, 'b-')
title("erreur d'interpolation : e(t)=sin(t)-p(t)")
