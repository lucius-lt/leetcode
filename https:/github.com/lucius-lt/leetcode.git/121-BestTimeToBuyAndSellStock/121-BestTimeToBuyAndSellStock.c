// Last updated: 7/17/2026, 12:59:22 AM
/*int maxProfit(int* prices, int pricesSize) {
     if (pricesSize == 0) {
        return 0; // No profit can be made with no prices
    }
    int min=prices[0];
    int max=0;
    int minindex;
    for(int i=0;i<pricesSize;i++){
        if(prices[i]<min){
            min=prices[i];
            minindex=i;
        }
       /* else if(prices[i]-min>max){
            max = prices[i] - min;
        }
    }
    if(minindex==pricesSize-1){
        return 0;
    }
    for(int i=minindex;i<pricesSize;i++){
        if(prices[i]>max){
            max=prices[i];
        }
    }
int maxprofit=max-min;
return maxprofit;
   
}*/
int maxProfit(int* prices, int pricesSize) {
    if (pricesSize == 0) {
        return 0; // No profit can be made with no prices
    }

    int minPrice = prices[0]; 
    int maxProfit = 0;

    for (int i = 1; i < pricesSize; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]; 
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice;
        }
    }

    return maxProfit;
}