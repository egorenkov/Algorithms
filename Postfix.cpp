#include <iostream>
#include <vector>

//Задача:
//Найти сумму элементов на диапозоне от FROM до TO

std::vector<int> Postfix(std::vector<int>  seq, int size) {

	std::vector<int> new_seq( size +1 );
	new_seq[0] = 0;
	for (int i = 0; i < size; i++) {
		new_seq[i + 1] = new_seq[i] + seq[i];
	}
	return new_seq;
}

int Solution(std::vector<int> Postfix, int from, int to) {
	return Postfix[to] - Postfix[from-1];
}



int main() {

	std::vector<int> example = { 1,4,5,6,3,1,54,3 };

	std::vector<int> n_s = Postfix(example, example.size());

	std::cout << Solution(n_s, 2, 3);


	return 0;

}
