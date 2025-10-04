TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.

24. A HashMap<K, V> is a class found in the java.util package that provides a hash table based implementation of the Map interface.
    The primary purpose of a HashMap is to associate specific keys with specific values and provide efficient storage and retrieval of these mappings
    Using a HashMap involves creation, configuring performance parameters, and invoking its various methods for manipulation.

25. Methods Depending on K (Key Type): keySet, compute, computeIfAbsent, computeIfPresent, put, putAll and merge.
    Methods Depending on V (Value Type): values, get, remove, put, putAll, compute, computeIfAbsent, computeIfPresent, merge.
    Yes, the same type could be used for both of the HashMap parameters.
    
26. use size() method.

27. Done.

28. the key doesnt change and the value is overwritten.

29. It will simply be added to the HashMap

30. if (phoneBook.containsKey(Noel)){
        System.out.println("Noel is in the book");
    }else {
        System.out.println("Noel is not in the book)
    }

31. it will output null.

32. use the keySet() method.

33. 

34. They are both are unsynchronized implementations and both implementations permit the use of null elements

35. the ArrayList allows duplicates and is well ordered, where as the HashSet is the opposite

36. Nothing

37. not sure if its correct.