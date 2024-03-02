#include <iostream>
using namespace std;

// Function to perform sequential search
int sequentialSearch(int arr[], int size, int key) {
    for (int i = 0; i < size; ++i) {
        if (arr[i] == key) {
            return i; // Return index if key found
        }
    }
    return -1; // Return -1 if key not found
}

int main() {
    const int N = 10; // Size of the array
    int myArray[N] = {12, 34, 45, 67, 89, 23, 56, 78, 90, 32}; // Initialize array

    int searchKey;
    cout << "Enter the element to search: ";
    cin >> searchKey;

    int index = sequentialSearch(myArray, N, searchKey);

    if (index != -1) {
        cout << "Element found at index: " << index << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}
