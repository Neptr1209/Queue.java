// Sum (tri)
public int tri(int n){
    if(n<=0)return 0;
    return n + tri(n-1);
}
// Factorial (fact)
public int fact(int n){
    if(n<=1)return 1;
    return n * fact(n-1);
}
// Fibonacci
public int fib(int n){
    if(n<=1) return n;
    return fib(n-1)+fib(n-2);
}
// Reverse String
public String reverseStr(String str){
    if (str.length() <=1) return str;
    return reverseStr(str.substring(1)) + str.charAt(0);
}
// hasChar
public boolean hasChar(String str, char c){
    if(str.isEmpty()) return false;
    if(str.charAt(0)==c) return true;
    return hasChar(str.substring(1),c);
}
// gcd-Euclid algorithm recursively
public int gcd(int x1, int x2) {
    if (x2 == 0) return x1;
    return gcd(x2, x1 % x2);
}
// countUniquePaths (n x m grid)
public int countUniquePaths(int n, int m){
    if(n==1 || m==1) return 1;
    return countUniquePaths(n-1,m)+countUniquePaths(n,m-1);
}

