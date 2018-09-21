; linear search lisp program

(defun linear-search (list item)
  (loop for pos from 0 and element in list
        when (eql item element)
          do (return pos)))

(princ (linear-search '(21 72 36 94 45) 94))
