#include<stdio.h>

int main()
{
	int nor,nop,i,j,k=0,count1=0,count2=0;

	printf("Enter the number of resources and processes:\t");
	scanf("%d%d",&nor,&nop);

	int available[nor],finish[nop],allocation[nop][nor],max[nop][nor],need[nop][nor],work[nor];

    printf("Enter the instances of each resource available:\t");
    for (i = 0; i < nor; ++i)
    {
        scanf("%d",&available[i]);
        work[i]=available[i];
    }

    for(i = 0; i < nop; ++i)
        finish[i]=0;

    printf("Enter the allocation matrix:\n");                //allocation matrix
    for (i = 0; i < nop; ++i)
    {
    	for (j = 0; j < nor; ++j)
    	{
    		scanf("%d",&allocation[i][j]);
    	}
    }

    printf("Enter the Max matrix:\t");                          //Max matrix
    for (i = 0; i < nop; ++i)
    {
    	for (j = 0; j < nor; ++j)
    	{
    		scanf("%d",&max[i][j]);
    	}
    }

    for (i = 0; i < nop; ++i)                                  //Need matrix
    {
    	for (j = 0; j < nor; ++j)
    	{
    		need[i][j]=max[i][j]-allocation[i][j];
    	}
    }

    printf("Safe Sequence:\t")
    while(count1 != nop)
    {
        count2=count1;
        for (i = 0; i < nop; ++i)
        {
    	    for (j = 0; j < nor ; ++j)
    	    {
    	        if(need[i][j] <= work[j])
    	        {
    	            k++;
    	        }
    	    }
            if(k == nor && finish[i] == 0)
            {
                printf("P[%d]\t",i);
                finish[i]=1;
    		    for(j = 0 ; j < nor ; j++)
                {
                    work[j]+=allocation[i][j];
                }
    		    count1++;
            }
            k=0;
        }
        if(count1=count2)
        {
            printf("Deadlock state!!");
            break;
        }
    }

    return 0;
}



