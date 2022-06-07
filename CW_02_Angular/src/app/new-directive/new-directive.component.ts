import { Component, OnInit,Input } from '@angular/core';

@Component({
// Selector uses lower case with hyphens.
  selector: 'second-directive',
  template: `<h3>This is the second directive!{{firstName}}</h3>
    <app-new-directive3></app-new-directive3>,`
})
export class NewDirectiveComponent implements OnInit {
  @Input()
  firstName: string;
  constructor() { }

  ngOnInit(): void {
  }

}
