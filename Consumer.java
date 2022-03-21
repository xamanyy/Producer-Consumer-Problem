class Consumer extends Thread {

  Company company;

  Consumer(Company company) {
    this.company = company;
  }

  public void run() {

    while (true) {

      try{
      this.company.consumer_items();}
      catch (Exception e){}
      try {
        Thread.sleep(5000);
      } catch (Exception e) {
      }

    }
  }
}
