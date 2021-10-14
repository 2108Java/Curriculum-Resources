import { TestBed } from '@angular/core/testing';

import { PokeAjaxService } from './poke-ajax.service';

describe('PokeAjaxService', () => {
  let service: PokeAjaxService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PokeAjaxService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
