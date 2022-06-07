import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewDirective3Component } from './new-directive3.component';

describe('NewDirective3Component', () => {
  let component: NewDirective3Component;
  let fixture: ComponentFixture<NewDirective3Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewDirective3Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewDirective3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
