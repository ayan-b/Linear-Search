#include <stdio.h>

int main(int argc, char* args[]) {
    int data_size;

    printf("Size of data: ");
    scanf("%d", &data_size);

    int data[data_size];

    for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
        printf("Adding item (%d/%d): ", i+1, (int) (sizeof(data) / sizeof(data[0])));
        scanf("%d", &data[i]);
    }

    for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
        printf("%d", data[i]);
        if (i < sizeof(data) / sizeof(data[0]) - 1) {
            printf(", ");
        } else {
            printf("\n");
        }
    }

    printf("Perform sequential search for: ");
    int target;
    scanf("%d", &target);

    for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) {
        if (target == data[i]) {
            printf("Found item at index: %d\n", i);
            return 0;
        }
    }
    printf("Item not found.\n");

    return 1;
}
