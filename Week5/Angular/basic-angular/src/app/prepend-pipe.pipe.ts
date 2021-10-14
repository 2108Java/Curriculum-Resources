import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'prependPipe'
})
export class PrependPipePipe implements PipeTransform {

  /**
   * Why do we use pipes?
   *    They don't modify the underlying data - just format the view. Very useful if you 
   *    have multiple components that rely on the same data. 
   */
  transform(param1: string, param2: string): string {

    /**
     * You would some really fancy logic in here
     * 
     * In my case I'm just prepending a value to another value
     */

    return param2.concat(param1);
  }

}
