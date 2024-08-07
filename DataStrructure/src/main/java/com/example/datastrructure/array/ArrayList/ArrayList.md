# Array List

- Accessing elements is O(1) since an array list allows direct indexing.
- An Array List doubles its size when it reaches its capacity (`Doubling`).   
- The time required to copy elements during this process is O(n), but the average time to add new data is O(1).   
- Adding data at the Doubling point might take O(n) time, but after doubling, adding data averages to O(1) since no further copying is needed.

### Unlike an array :
- A typical array requires defining its size at declaration and cannot be easily resized.
- Array Lists provide dynamic resizing, while arrays have a fixed size.
- 