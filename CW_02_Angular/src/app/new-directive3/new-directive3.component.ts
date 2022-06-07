import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-directive3',
  template: `<h3>hello from the third directive</h3>`,
})
export class NewDirective3Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
