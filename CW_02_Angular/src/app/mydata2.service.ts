import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Mydata2Service {
  myname: string;
  constructor() {
    this.myname ="mydata2";
  }
  getmyNames() {
    return this.myname;
  }
}
