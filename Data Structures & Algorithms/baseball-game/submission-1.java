class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int[] arr = new int[operations.length];
        int i = 0;
        for(String operation : operations)
        {
            if(operation.equals("+"))
            {
                arr[i] = arr[i - 1] + arr[i - 2];
                sum += arr[i];
            }
            else if(operation.equals("D"))
            {
                arr[i] = arr[i - 1] + arr[i - 1];
                sum += arr[i];
            }
            else if(operation.equals("C"))
            {
                i = i - 1;
                sum -= arr[i];
                continue;
            }
            else
            {
                arr[i] = Integer.parseInt(operation);
                sum += arr[i];
            }
            i++;
        }
        return sum;
    }
}