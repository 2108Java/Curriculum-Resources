import { TestBed } from '@angular/core/testing';

import { SwapiAjaxService } from './swapi-ajax.service';

describe('SwapiAjaxService', () => {
  let service: SwapiAjaxService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SwapiAjaxService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
