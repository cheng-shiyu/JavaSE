package com.chengshiyu.Demo05;



public class HashMap<K,V> implements Map<K,V> {


    /*创建一个数组，因为hashMap是数组加链表*/
    private Entry<K, V>[] table = null;

    /*map 的大小写*/
    private int size = 0;

    public HashMap() {
        this.table =  new Entry[16];
    }


    /**
     * 添加元素
     * @param key key
     * @param value value
     * @return hashMap
     *
     * 通过key，利用hash值，将其转换为下标
     * index就表示当前的下标
     * 判断数组里面当前位置对象是否为空，如果为空，那么就直接存储
     * 如果不为空，出现了hash冲突问题
     * 则进行链式存储
     */
    @Override
    public V put(K key, V value) {
        int index = hash(key);

        Entry<K, V> entry = table[index];

        /*如果当前数组位置是空，直接放入其中即可*/
        if (entry == null){
            table[index] = new Entry<>(key,value,index,null);
        }else {
            /*如果当前位置有值，那么我们采用头插入进行插入即可*/
            table[index] = new Entry<K, V>(key, value, index, (Entry<K, V>) entry);
        }
        size++;
        return table[index].getValue();
    }




    /**
     * 根据key获取单个map里面的值
     * @param key key
     * @return object
     * 1、传入key，计算hash值，得到他的下标
     * 2、根据这个下标进行寻找值
     * 3、如果不重复，就可以
     */
    @Override
    public V get(K key) {
        /*1、根据key得到我们下标*/
        int index = hash((K) key);


        Entry<K, V> entry = findEntry(key, table[index]);

        return entry == null? null : entry.getValue();
    }



    public int hash(K key) {
        /*对hashcode进行取余计算，得到一个下标*/
        int code = key.hashCode() % 16;
        /*返回*/
        return code > 0 ? code:-code;
    }


    private Entry<K, V> findEntry(K k, Entry<K, V> entry){
        if (k.equals(entry.getKey())){
            return entry;
        }else{
            if (entry.next != null){
                findEntry(k,entry.next);
            }
            return null;
        }
    }
    @Override
    public boolean isEmpty() {
        return size != 0 ? false : true;
    }

    @Override
    public int size() {
        return size;
    }

    class Entry<K,V> implements Map.Entry{


        K k;
        V v;
        int hash;
        Entry<K, V> next;

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

    }
}
