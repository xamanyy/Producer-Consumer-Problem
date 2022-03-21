class Producer implements Runnable {

  Company company;

  Producer(Company company) {

    this.company = company;

  }

  public void run() {
    int i = 1;

    while (true) {

      try{
      this.company.producer_item(i);
      }catch(Exception e){}

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      i++;
    }
  }
}
