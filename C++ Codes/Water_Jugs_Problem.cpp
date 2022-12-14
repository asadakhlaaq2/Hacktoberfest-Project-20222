#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
// Utility function to print a vector
void printVector(vector<int> const &A, string msg)
{
    cout << msg << ": ";
    for (int i: A) {
        cout << i << " ";
    }
    cout << endl;
}
 
// This function is similar to the partition routine of the Quicksort algorithm.
// It partitions the specified array A[low, high] around `pivot`
// and returns the partition index.
int partition(vector<int> &A, int low, int high, int pivot)
{
    int pIndex = low;
    for (int j = low; j < high; j++)
    {
        if (A[j] < pivot)
        {
            swap(A[pIndex], A[j]);
            pIndex++;
        }
        else if (A[j] == pivot)
        {
            swap(A[j], A[high]);
            j--;
        }
    }
 
    swap(A[pIndex], A[high]);
    return pIndex;
}
 
// Group the jugs into pairs of red and blue jugs that hold the same amount of water.
// This function is similar to the Quicksort-like routine.
void findMatchingPairs(vector<int> &red, vector<int> &blue, int low, int high)
{
    // base case: if there is only one red jug and one blue jug,
    // they must be of the same size
    if (low >= high) {
        return;
    }
 
    // Randomly select a jug from either red or blue jugs
    int r = rand() % (high - low + 1) + low;
    int chosenJug = red[r];     // or use blue[r]
 
    // Partition the red jugs around the chosen jug
    int pivot = partition(red, low, high, chosenJug);
 
    // Now partition the blue jugs around the chosen jug
    partition(blue, low, high, chosenJug);
 
    // `pivot` now points to an index of the chosen jug in red/blue jugs.
 
    // Recur, once the red and blue jugs are divided into two groups
    // around the chosen jug
    findMatchingPairs(red, blue, low, pivot - 1);
    findMatchingPairs(red, blue, pivot + 1, high);
}
 
int main()
{
    vector<int> red = { 6, 3, 2, 8, 7 };
    vector<int> blue = { 8, 6, 7, 2, 3 };
 
    int n = red.size();
    findMatchingPairs(red, blue, 0, n - 1);
 
    printVector(red, "Red jugs");
    printVector(blue, "Blue jugs");
 
    return 0;
}
