/**
 * test_pdf39_gen.php
 *
 * @author David Wilcock <dwilcock@doc-net.com>
 * @copyright Venditan Limited 2016
 */

package tfpdf.cmd;

require_once __DIR__.'/../vendor/autoload.php';

class TestPdf39Gen {

public static void main (String[] args) {
	
$obj_pdf = new \tFPDF\PDFBarcode();
$obj_pdf->AddPage();
$obj_pdf->Code39(5, 5, '1234566700345');
$str_file = sys_get_temp_dir() . '/tfpdf_code39_test.pdf';
file_put_contents($str_file, $obj_pdf->output());

echo "Written file " . $str_file . PHP_EOL;
}
}