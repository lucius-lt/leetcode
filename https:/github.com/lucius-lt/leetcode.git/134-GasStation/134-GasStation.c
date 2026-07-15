// Last updated: 7/16/2026, 1:11:03 AM
int canCompleteCircuit(int* gas, int gasSize, int* cost, int costSize) {
    int total=0,curr=0,start=0;
    for(int i =0;i<gasSize;i++){
        int diff=gas[i]-cost[i];
        total+=diff;
        curr+=diff;
        if(curr<0){
            curr=0;
            start=i+1;
        }
    }
    return (total>=0)?start:-1;
}