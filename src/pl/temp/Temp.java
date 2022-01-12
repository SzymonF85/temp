package pl.temp;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.*;
import net.mindview.util.*;
import net.mindview.util.Stack;
// ćw 1, 8, 17
//class Gerbil {
//    int gerbilNumber;
//    Gerbil(int i) {
//        gerbilNumber = i;
//    }
//    int hop() {
//        System.out.println("Gerbil.hop()");
//        return gerbilNumber;
//    }
//    @Override
//    public String toString() {
//        return "Gerbil: " + gerbilNumber;
//    }
//}

// ćw 7
//class K7 {}

// ćw 10
//class Gryzon {
//    public void speak() {
//        System.out.println("Gryzon.speak()");
//    }
//}
//class Mysz extends Gryzon {
//    @Override
//    public void speak() {
//        System.out.println("Mysz.speak()");
//    }
//}
//class Chomik extends Gryzon {
//    @Override
//    public void speak() {
//        System.out.println("Chomik.speak()");
//    }
//}

// ćw 27
//class Command {
//    private String s;
//    public Command(String s) {
//        this.s = s;
//    }
//    public void operation() {
//        System.out.println(s);
//    }
//}
//
//class K27 {
//    public Queue<Command> fillQ() {
//        Queue<Command> q = new LinkedList<>();
//        q.add(new Command("command 1"));
//        q.add(new Command("command 2"));
//        q.add(new Command("command 3"));
//        return q;
//    }
//}

// ćw 29
//class K29 extends Object {}

// ćw 22
//class Word {
//    private String s;
//    private int count = 1;
//    Word(String s) {
//        this.s = s;
//    }
//    public String getWord() {
//        return s;
//    }
//    public int getCount() {
//        return count;
//    }
//    public void increment() {
//        count++;
//    }
//}

public class Temp {
// ćw 4
//    static int counter;
//    static Collection fill(Collection<String> collection) {
//        collection.add("Jack");
//        collection.add("Sam");
//        collection.add("Daniel");
//        collection.add("Teal'c");
//        return collection;
//    }
//    static String next(Collection<String> collection) {
//        Object[] temp = collection.toArray();
//        return (String) temp[counter++ % collection.size()];
//    }

// ćw 11
//    static void displayByIterator(Collection collection) {
//        Iterator<Object> it = collection.iterator();
//        while(it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }
//    }

// ćw 27
//    static void displayQ(Queue<Command> q) {
//        while(!q.isEmpty()){
//            q.remove().operation();
//        }
//    }

    public static void main(String[] args) {
// ćw 1, 8
//        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
//        for(int i = 0; i < 4; i++) {
//            gerbils.add(new Gerbil(i));
//        }
//        Iterator<Gerbil> itg = gerbils.iterator();
//        while(itg.hasNext()) {
//            Gerbil g = itg.next();
//            System.out.println(g.hop());
//        }

// ćw 4
//        ArrayList<String> al = (ArrayList<String>) fill(new ArrayList<>());
//        LinkedList<String> ll = (LinkedList<String>) fill(new LinkedList<>());
//        HashSet<String> hs = (HashSet<String>) fill(new HashSet<>());
//        LinkedHashSet<String> lhs = (LinkedHashSet<String>) fill(new LinkedHashSet<>());
//        TreeSet<String> ts = (TreeSet<String>) fill(new TreeSet<>());
//
//        for(int i = 0; i < 10; i++)
//            System.out.println(next(ts));

// ćw 7
//        K7[] tabk7 = new K7[5];
//        for(int i = 0; i < 5; i++) {
//            tabk7[i] = new K7();
//        }
//        List<K7> listk7 = new ArrayList<>();
//        for(K7 k7 : tabk7)
//            listk7.add(k7);
//        List<K7> sublistk7 = listk7.subList(1, 4);
//        System.out.println(listk7);
//        System.out.println(sublistk7);
//        listk7.removeAll(sublistk7);
//        System.out.println(listk7);

// ćw 10
//        List<Gryzon> listG = new ArrayList<>();
//        listG.add(new Gryzon());
//        listG.add(new Mysz());
//        listG.add(new Chomik());
//        Iterator<Gryzon> it = listG.iterator();
//        while(it.hasNext()) {
//            Gryzon g = it.next();
//            g.speak();
//        }

// ćw 11
//        List<String> als = new ArrayList<>();
//        List<Integer> lli = new LinkedList<>();
//        Set<Character> hsc = new HashSet<>();
//        Set<Double> tsd = new TreeSet<>();
//        als.add("cos"); als.add("sobie"); als.add("pisze");
//        lli.add(13); lli.add(99); lli.add(7);
//        hsc.add('e'); hsc.add('f'); hsc.add('c');
//        tsd.add(1.3); tsd.add(4.8); tsd.add(2.4);
//        displayByIterator(als);
//        displayByIterator(lli);
//        displayByIterator(hsc);
//        displayByIterator(tsd);

// ćw 12
//        List<Integer> list1 = new ArrayList<>(8);
//        List<Integer> list2 = new ArrayList<>(8);
//        for(int i = 10; i < 18; i++) {
//            list1.add(i);
//            list2.add(0);
//        }
//        ListIterator<Integer> it1 = list1.listIterator();
//        ListIterator<Integer> it2 = list2.listIterator(8);
//        while(it1.hasNext()) {
//            int i = it1.next();
//            it2.previous();
//            it2.set(i);
//        }
//        System.out.println(list1);
//        System.out.println(list2);

// ćw 14
//        List<Integer> listInt = new LinkedList<>();
//        int position;
//        for(int i = 0; i < 20; i++) {
//            position = listInt.size() / 2;
//            listInt.listIterator(position).add(i);
//        }
//        System.out.println(listInt);

// ćw 15
//        String wyrazenie = "+B+a+l---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
//        Stack<Character> stos = new Stack<>();
//        for(char c: wyrazenie.toCharArray()) {
//            if(c == '-') {
//                stos.pop();
//                System.out.println(stos);
//                continue;
//            }
//            else if (c != '+') {
//                stos.push(c);
//                System.out.println(stos);
//            }
//        }

// ćw 17
//    Map<String, Gerbil> map = new HashMap<>();
//    map.put("jer", new Gerbil(2));
//    map.put("fig", new Gerbil(4));
//    map.put("bog", new Gerbil(3));
//    Set<String> set = map.keySet();
//    Iterator<String> it = set.iterator();
//    String temp;
//    Gerbil tempG;
//    while(it.hasNext()) {
//        temp = it.next();
//        tempG = map.get(temp);
//        System.out.println(temp + "-" + tempG);
//        tempG.hop();
//    }

// ćw 21
//        Map<String, Integer> map = new LinkedHashMap<>();
//        List<String> words = new ArrayList<String>(new TextFile("Temp.txt", "\\W+"));
//        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
//        int temp = 0;
//        for(String s: words) {
//            if(map.get(s) == null)
//                map.put(s, 1);
//            else {
//                temp = map.get(s) + 1;
//                map.put(s, temp);
//            }
//        }
//        System.out.println(map);

// ćw 22
//        List<String> words = new ArrayList<String>(new TextFile("Temp.txt", "\\W+"));
//        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
//        Set<Word> setW = new HashSet<>();
//        int temp = 0;
//        String tempS;
//        boolean found;
//        for(String s: words) {
//            found = false;
//            for(Word w: setW) {
//                if(w.getWord().equals(s)) {
//                    w.increment();
//                    found = true;
//                    break;
//                }
//            }
//            if(!found) {
//                setW.add(new Word(s));
//            }
//        }
//        System.out.println(words);
//        for(Word w: setW) {
//            System.out.println(w.getWord() + ": " + w.getCount());
//        }

// ćw 23
//        Random rand = new Random(47);
//        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
//        Set<Integer> si = new TreeSet<>();
//        Map<Integer, Integer> finalMap = new TreeMap<>();
//        for(int x = 0; x < 10; x++) {
//            for (int i = 0; i < 10000; i++) {
//                int r = rand.nextInt(20);
//                Integer freq = m.get(r);
//                m.put(r, freq == null ? 1 : freq + 1);
//            }
//        }
//        for (int x: m.values()) {
//            si.add(x);
//        }
//        for (int x: si) {
//            for(int k: m.keySet()) {
//                if(x == m.get(k))
//                    finalMap.put(x, k);
//            }
//        }
//        System.out.println(finalMap);

// ćw 24
//        Map<String, Integer> source = new LinkedHashMap<>();
//        Map<String, Integer> dest = new LinkedHashMap<>();
//        Set<String> tempSet = new TreeSet<>();
//        source.put("cos", 5);
//        source.put("tam", 10);
//        source.put("aaa", 7);
//        source.put("zzz", 2);
//        for(String s: source.keySet())
//            tempSet.add(s);
//        for(String s: tempSet) {
//            dest.put(s, source.get(s));
//        }
//        System.out.println(dest);

// ćw 25
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        int counter = 0;
        boolean found;
        for(String s: new TextFile("Temp.txt", "\\W+")) {
            counter++;
            found = false;
            tempList.clear();
            for(String mapS: map.keySet()) {
                if(mapS.equals(s)) {
                    tempList = map.get(s);
                    tempList.add(counter);
                    map.put(s, new ArrayList<>(tempList));
                    found = true;
                    break;
                }
            }
            if(!found) {
                tempList.add(counter);
                map.put(s, new ArrayList<>(tempList));
            }

        }
        System.out.println(map);

// ćw 27
//        displayQ(new K27().fillQ());

// ćw 28
//        PriorityQueue<Double> pqD = new PriorityQueue<>();
//        Random random = new Random();
//        for(int i = 0; i < 10; i++) {
//            pqD.offer(random.nextDouble(50.0));
//        }
//        for(int i = 0; i < 10; i++) {
//            System.out.println(pqD.poll());
//        }

// ćw29
//        PriorityQueue<K29> pq29 = new PriorityQueue<>();
//        for(int i=0; i<10; i++)
//            pq29.offer(new K29());

// inne
//        for(Map.Entry entry: System.getenv().entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


    }
}
