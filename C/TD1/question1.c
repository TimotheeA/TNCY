int f(int x, int*y, int z) {
  int a;
  x = x + *y;
  a = 3;
  *y = *y - x;
  z = x - *y;
  return z;
}

int main (int argc, char *argv[]) {
  int a, b, d, e;
  int *c;
  
  a = 5;
  b = 9;
  c = &e;
  *c = 23;
  d = f(a, &b, *c);
  printf("a : %d b : %d d : %d e : %d\n",a ,b ,d ,e);
  return 0;
}
