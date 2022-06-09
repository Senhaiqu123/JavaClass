import {Directive, ElementRef, HostListener, Input} from '@angular/core';

@Directive({
  selector: '[appMyHighlight]'
})
export class HighlightDirective {
  constructor(private el: ElementRef) { }
// Pass color from 'myHighlight' attribute to 'highlightColor' model.
  @Input('appMyHighlight')
  highlightColor: any;
// Set color on mouse entry. 'red' is the default.
  @HostListener('mouseenter')
  onMouseEnter() {
    this.highlight( this.highlightColor || 'red');
  }
// Set color to null on mouse exit.
  @HostListener('mouseleave')
  onMouseLeave() {
    this.highlight(null);
  }
  private highlight(color: any) {
    this.el.nativeElement.style.backgroundColor = color;
  }
}
