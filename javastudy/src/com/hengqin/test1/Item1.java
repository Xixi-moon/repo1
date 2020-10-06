package com.hengqin.test1;

import java.util.Objects;

public class Item1 implements Comparable<Item1>{
        private int iid;
        private String description;
        public Item1(int iid,String description){
            this.iid = iid;
            this.description = description;
        }
        public String getDescription(){
            return this.description;
        }
        public String toString(){
            return "[description="+this.description+",partiid="+this.iid+"]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            com.hengqin.test1.Item1 item1 = (com.hengqin.test1.Item1) o;
            return iid == item1.iid &&
                    Objects.equals(description, item1.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(iid, description);
        }
        public int compareTo(com.hengqin.test1.Item1 other){
            int diff = Integer.compare(iid,other.iid);
            return diff != 0 ? diff:description.compareTo(other.description);
        }
    }
