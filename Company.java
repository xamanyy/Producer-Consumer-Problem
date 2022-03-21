class Company {

  int n;

  boolean flag = false;

  /*
      If flag is false then it will be the chance for the production unit to produce the item.
      Otherwise, if my flag is true ythen it will be the chance for the Consumtion unit to consume the item.

   */


  synchronized public void producer_item(int n) throws Exception{

    if(flag) {
      wait();
    }
    this.n = n;
    System.out.println("Produced Item " + this.n);
    flag = true;
    notify();
  }

  synchronized public int consumer_items() throws Exception{

    if(!flag)
    {
      wait();
    }

    System.out.println("Cosnumed Item " + this.n);
    flag = false;
    notify();
    return this.n;
  }

}