import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyServiceService {
  names: Array<any>;
  constructor() {
    this.names = ['John', 'Mary', 'Joan'];
  }
  getNames() {
    return this.names;
  }

}
