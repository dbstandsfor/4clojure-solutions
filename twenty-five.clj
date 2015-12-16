;;find the odd numbers

(defn answer (filter #(= (mod % 2) 1)))

;;tests

(= (answer #{1 2 3 4 5}) '(1 3 5))

(= (answer [4 2 1 6]) '(1))

(= (answer [2 2 4 6]) '())

(= (answer [1 1 1 3]) '(1 1 1 3))
