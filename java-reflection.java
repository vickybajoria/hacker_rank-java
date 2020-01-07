public class Solution {

        public static void main(String[] args){
            Student s = new Student();
            Method[] methods = s.getClass().getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m: methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }