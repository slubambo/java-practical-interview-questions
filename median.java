Arrays.sort(numArray);
double median;
if (numArray.length % 2 == 0)
    median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
else
    median = (double) numArray[numArray.length/2];