import { TestBed } from '@angular/core/testing';

import { Mydata2Service } from './mydata2.service';

describe('Mydata2Service', () => {
  let service: Mydata2Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Mydata2Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
