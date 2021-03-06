import numpy as np
 
def lagrange(t,x,y):
    """t : abscisse d'évaluation du polynôme d'interpolation
      x, y : points d'interpolation"""
    p = 0
    n = len(x)
    for i in range(n):
        Li = 1
        for j in range(n):
            if (j!=i):
                Li=Li*(t-x[j])/(x[i]-x[j])
           
            # calcul du i eme monôme L_i(t)
 
        p = p + y[i]*Li
    return p
 
def lagrange_v(tv,x,y):
    """tv : vecteur d'abscisses sur lesquelles on veut évaluer le polynome d'interpolation
      x, y : points d'interpolation"""
    pv = np.zeros_like(tv)
    m = len(pv)
    for k in range(m):
        pv[k] = lagrange(tv[k],x,y)
 
    return pv
   
def runge(x):
    return (1/(1+x*x))

def tchebichev(a, b, n):
    N = np.zeros(n)
    for i in range(n) :
        N[i] = np.cos((2 * i + 1) * np.pi / (2. * n))
        N[i] = (a + b) / 2 + ((b - a) / 2) * N[i]
    return N
        
def lagrange_poids_fb(x):
