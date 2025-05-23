import java.lang.reflect.Array;
import java.util.ArrayList;
public class UserList {
        ArrayList<User> ul = new ArrayList<User>();
        public ArrayList<User>addUser(User usl)) {
            st.add(usl);
            return ul;
        }
        public ArrayList<User> getEditUser(String usename, int Id) {
            for (int i = 0; i < ul.size(); i++) { 
                if (ul.get(i).id == Id) {
                    System.out.print("true");
                    ul.get(i).usename = usename;
                }
            }
            return ul;
        }
        public ArrayList<User> getDeleteUser(int Id) {
            for (int i = 0; i < ul.size(); i++) {
                if (ul.get(i).id == Id) {
                    ul.remove(i);
                }
            }
            return ul;
        }
        public void printUserList() {
            int k = ul.size();
            for (int i = 0; i < k; i++) {
                System.out.println("ID: " + ul.get(i).id + " Username: " + ul.get(i).usename + " Password: " + ul.get(i).passworld + " Email: " + ul.get(i).email);
            }
        }
