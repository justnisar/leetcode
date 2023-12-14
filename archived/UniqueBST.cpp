class UniqueBST {
public:
    int numTrees(int n) {
        long long int a[n];
        a[0] = 1;
        
        for(int i = 1 ; i < n + 1 ; i++){
            a[i] = ( a[i-1] * (4 * i - 2) )/(i+1);
        }
    
    return a[n];    
    }
};
